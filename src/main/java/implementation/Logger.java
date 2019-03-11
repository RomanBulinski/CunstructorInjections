package implementation;

import java.util.Date;

public class Logger implements ILogger {

    private String name;
    private int version;

    public void log(String message) {
        System.out.println( new Date()+" [ "+name+" ver: "+version+" ]" + " : "+ message );
    }

    public void setName(String name){
        this.name = name;
    }

    public void setVersion(int version){
        this.version = version;
    }

}
