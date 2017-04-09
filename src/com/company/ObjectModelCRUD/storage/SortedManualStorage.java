package com.company.ObjectModelCRUD.storage;

import com.company.ObjectModelCRUD.model.Resume;

/**
 * Created by Stas on 12.02.2017.
 */
public class SortedManualStorage extends AbstractResumeStorage {

    @Override
    public int getIndex(String uuid) {
        int insertKey = Integer.parseInt(uuid);
        if (size == 0)
            return -1;
        int lowerBound = 0;
        int upperBound = size - 1;
        int curIn;
        while (true) {
            curIn = (upperBound + lowerBound) / 2;
            if (Integer.parseInt(storage[curIn].getUuid()) == insertKey)
                return curIn;
            if (Integer.parseInt(storage[curIn].getUuid()) < insertKey) {
                lowerBound = curIn + 1; // its in the upper
                if (lowerBound > upperBound) {
                    if (!(lowerBound > size - 1)) {
                        if (Integer.parseInt(storage[lowerBound].getUuid()) == insertKey) {
                            return curIn + 1;
                        }
                    }
                    return -(curIn + 1);

                } else {
                    upperBound = curIn - 1; // its in the lower

                    if (lowerBound > upperBound) {
                        if (!(upperBound < 0)) {
                            if (Integer.parseInt(storage[upperBound].getUuid()) == insertKey)
                                return curIn;
                        }
                        return -curIn;
                    }
                }
            }
        }
    }

    @Override
    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if (index < 0) {
            System.out.println("Sorry, i can't save! Resume " + r.getUuid() + " already exist!");
        } else if (isOverflow()) {
            System.out.println("Sorry, i can't save new resume. storage is full!");
        } else {
            int insertIdx = index;
            //int insertIdx = -index - 1;
            if (size == 0) {
                storage[size] = r;
            } else {
                for (int i = 0; i < size - insertIdx; i++) {
                    storage[size - i] = storage[size - 1 - i];
                }
                storage[insertIdx] = r;
            }
            size++;
        }

    }

    @Override
    public void delete(String uuid) {
        int index = getIndex(uuid);
        if (index >= 0) {
            for (int i = index; i < size; i++) {
                storage[i] = storage[i + 1];
            }
            storage[size - 1] = null;
            size--;
        } else {
            System.out.println("резюме с " + uuid + "не существует!");
        }


    }

//проверка на integer
//    private boolean isInteger(String testString) {
//        return testString.matches("[1-9][0-9]{0,4}");
//    }

}
