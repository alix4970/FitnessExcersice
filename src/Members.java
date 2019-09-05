import java.util.ArrayList;
import java.util.List;

public class Members extends Person {

    private boolean isBasic;

    public Members(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public Members(String name, String cpr){
        super(name,cpr);
    }

    public Members(){
        isBasic = true;
    }

    //getters & setters

    public void basic(){
        //basic medlemskab

        isBasic = true;
    }

    public void premium(){
        isBasic = false;
    }


    public String getMemberType(){
        if(this.isBasic){
            return ("Basic membership");

        }else{
            return ("premium membership");
        }

    }

    public int monthlyFee(){
        if (this.isBasic){

            return 149;

        }else {

            return 299;
        }
    }
}

