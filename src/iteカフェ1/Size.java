package iteカフェ1;

public class Size {

    private char SS;
    private char S;
    private char M;
    private char L;
    private char LL;

    public Size(char SS, char S, char M, char L, char LL) {
        this.SS = SS;
        this.S = S;
        this.M = M;
        this.L = L;
        this.LL = LL;
    }

    public char getSS() {
        return SS;
    }

    public void setSS() {
        this.SS = SS;
    }

    public char getS() {
        return S;
    }

    public void setS() {
        this.S = S;
    }

    public char getM() {
        return M;
    }

    public void setM() {
        this.M = M;
    }

    public char getL() {
        return L;
    }

    public void setL() {
        this.SS = L;
    }

    public char getLL() {
        return LL;
    }

    public void setLL() {
        this.SS = LL;
    }
}
