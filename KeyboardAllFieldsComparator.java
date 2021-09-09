package hw_lesson14;

import java.util.Comparator;

public class KeyboardAllFieldsComparator implements Comparator<Keyboard> {
    @Override
    public int compare(Keyboard k1, Keyboard k2) {
        if(k1.getManufacturerName().compareTo(k2.getManufacturerName()) > 0) {
            return 1;
        }
        else if(k1.getManufacturerName().compareTo(k2.getManufacturerName()) < 0) {
            return -1;
        }
        else {
            if(k1.getModelName().compareTo(k2.getModelName()) > 0) {
                return 1;
            }
            else if(k1.getModelName().compareTo(k2.getModelName()) < 0) {
                return -1;
            }
            else {
                if(k1.getKeyboardType().compareTo(k2.getKeyboardType()) > 0) {
                    return 1;
                }
                else if(k1.getKeyboardType().compareTo(k2.getKeyboardType()) < 0) {
                    return -1;
                }
                else {
                    if(k1.getSwitchesColor().compareTo(k2.getSwitchesColor()) > 0) {
                        return 1;
                    }
                    else if(k1.getSwitchesColor().compareTo(k2.getSwitchesColor()) < 0) {
                        return -1;
                    }
                    else {
                        if(k1.getLength() > k2.getLength()) {
                            return 1;
                        }
                        else if(k1.getLength() < k2.getLength()) {
                            return -1;
                        }
                        else {
                            if(k1.getWidth() > k2.getWidth()) {
                                return 1;
                            }
                            else if(k1.getWidth() < k2.getWidth()) {
                                return -1;
                            }
                            else {
                                if(k1.getKeyboardWeight() > k2.getKeyboardWeight()) {
                                    return 1;
                                }
                                else if(k1.getKeyboardWeight() < k2.getKeyboardWeight()) {
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }
        }

        return 0;
    }
}
