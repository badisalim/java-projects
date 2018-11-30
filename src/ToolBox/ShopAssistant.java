package Lectures9;

import DerekTool.Tool;

import java.util.List;

public class ShopAssistant {

    public List<Tool> getTools(){
        //List<Tool> tools=new ArrayList<>();
        ToolBox tools = new ToolBox("red");

        tools.add(new Tool("screwdriver"));
        tools.add(new Tool("hammer"));
        tools.add(new Tool("lkey"));

        return tools.getListOfTools();

    }
}
