package W4_lecture.datastructure;

public class ToolMaker {

    public void fillStorage(Storage toolStorage){
        toolStorage.addTool(new Tool("hammer"));
        toolStorage.addTool(new Tool("screwdriver"));
        toolStorage.addTool(new Tool("axe"));
        toolStorage.addTool(new Tool("nails"));
    }

}
