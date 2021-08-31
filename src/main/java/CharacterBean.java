

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "characterBean")
@SessionScoped
public class CharacterBean implements Serializable{

    public CharacterBean() {
    }
    
    private String skincolor;
    private String eyecolor = "";
    private String haircolor = "";
    
    public String getFilename(){
       return haircolor + eyecolor + skincolor;
    }
 
    public String getSkincolor() {
        return skincolor;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
    
   
            
}
