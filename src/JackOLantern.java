public class JackOLantern extends LanternRunner {
    private String faceFeatures[][];
    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }
    public void edit(String Replacing,int row,int column)
    {

    }
    public void fill(String face)
    {

    }
    public String toString()
    {
        String face = "";
        for(int i = 0;i < faceFeatures.length;i++)
        {
            for(int x = 0;x < faceFeatures[i].length;i++)
            {
                face += faceFeatures[i][x];
                face += "\n";
            }
        }
        return face;
    }
}
