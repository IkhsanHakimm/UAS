import java.util.ArrayList;
import java.util.Objects;

public class UAS1D {
    public String getMessageID() {
        return MessageID;
    }

    public void setMessageID(String messageID) {
        MessageID = messageID;
    }

    public String getMessageName() {
        return MessageName;
    }

    public void setMessageName(String messageName) {
        MessageName = messageName;
    }

    public ArrayList<String> getContext() {
        return Context;
    }

    public void setContext(ArrayList<String> context) {
        Context = context;
    }

    private String MessageID;
    private String MessageName;
    private ArrayList<String> Context;
    public ArrayList FindWords(ArrayList<String> conteks, String cari) {
        conteks.add(cari);
        for(String ok: Context){
            if(ok.contains(cari)){
                System.out.println("Indeks ke "+ Context.indexOf(cari));
            }
        }
        return conteks;
    }

    public UAS1D(){}
   public UAS1D(String id,String name, ArrayList<String> conteks){
        this.MessageID=id;
        this.MessageName=name;
        this.Context=conteks;


    }



}