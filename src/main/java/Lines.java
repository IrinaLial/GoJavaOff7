import java.util.ArrayList;

public class Lines {

    public ArrayList<String> lines;

    public void setLines(ArrayList<String> lines ){
    this.lines = lines;
    }
    public Lines(){
        lines = new ArrayList <String> ();
    }

    @Override
    public String toString ( ) {
        return "Lines{" +
                "lines=" + lines +
                '}';
    }
}


