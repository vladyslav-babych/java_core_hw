package hw_lesson16;

import java.util.Objects;

public class Keyboard {
    private String manufacturerName;
    private String modelName;
    private String keyboardType;
    private String switchesColor;
    private double length;
    private double width;
    private double keyboardWeight;

    public Keyboard(String manufacturerName, String modelName, String keyboardType, String switchesColor, double length, double width, double keyboardWeight) {
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.keyboardType = keyboardType;
        this.switchesColor = switchesColor;
        this.length = length;
        this.width = width;
        this.keyboardWeight = keyboardWeight;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public String getSwitchesColor() {
        return switchesColor;
    }

    public void setSwitchesColor(String switchesColor) {
        this.switchesColor = switchesColor;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getKeyboardWeight() {
        return keyboardWeight;
    }

    public void setKeyboardWeight(double keyboardWeight) {
        this.keyboardWeight = keyboardWeight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", keyboardType='" + keyboardType + '\'' +
                ", switchesColor='" + switchesColor + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", keyboardWeight=" + keyboardWeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyboard keyboard = (Keyboard) o;
        return Double.compare(keyboard.length, length) == 0 && Double.compare(keyboard.width, width) == 0 && Double.compare(keyboard.keyboardWeight, keyboardWeight) == 0 && Objects.equals(manufacturerName, keyboard.manufacturerName) && Objects.equals(modelName, keyboard.modelName) && Objects.equals(keyboardType, keyboard.keyboardType) && Objects.equals(switchesColor, keyboard.switchesColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturerName, modelName, keyboardType, switchesColor, length, width, keyboardWeight);
    }
}
