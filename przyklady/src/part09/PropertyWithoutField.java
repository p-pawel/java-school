package part09;

public class PropertyWithoutField {

    public int getZ()
    {
        return doSth("GET http://");
    }

    public void setZ(int x) {
        doSth("POST http://");
    }

    private int doSth(String s) {
        // to tylko przykład że niby robimy coś skomplikowanego w tych metodach
        return 0;
    }


}