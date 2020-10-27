package constructor;

public class DataType {

    public String ahmed = "Ahmed";
    private char aChar;
    private boolean aBoolean;
    private byte aByte;
    private short aShort;
    private int anInt;
    private float aFloat;
    private double aDouble;
    private long aLong;

    public DataType(){

    }

    public String getAhmed() {
        return ahmed;
    }

    public void setAhmed(String ahmed) {
        this.ahmed = ahmed;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public DataType(char aChar, boolean aBoolean, byte aByte, short aShort, int anInt, float aFloat, double aDouble, long aLong) {
        this.aChar = aChar;
        this.aBoolean = aBoolean;
        this.aByte = aByte;
        this.aShort = aShort;
        this.anInt = anInt;
        this.aFloat = aFloat;
        this.aDouble = aDouble;
        this.aLong = aLong;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    @Override
    public String toString() {
        return "DataType{" +
                "aChar=" + aChar +
                ", aBoolean=" + aBoolean +
                ", aByte=" + aByte +
                ", aShort=" + aShort +
                ", anInt=" + anInt +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                ", aLong=" + aLong +
                '}';
    }
}
