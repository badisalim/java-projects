package RobodogApplication.robodog;

import Julues.CaesarApplication;
import Julues.JuliusCaesar;
import MFileReader.FileReader;
import MapAdvancedIndexApplication.Topic;
import NFileReader.TopicReader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobodogApplication {

    private FileReader fileReader = new FileReader();


            public static void main (String[]args){
                TopicReader topicReader = new TopicReader();
                List<Topic> topicList = topicReader.getTopics("RobodogApplication/robodog/robodog.txt");
                for (Topic topic : topicList) {
                    System.out.println("Topic list: " + topic);
                }

                Set<Topic> topicSet = new HashSet<>(topicList);
                for (Topic topic : topicSet) {

                   // topic=topic.replace("!","");

                    System.out.println("Topic set : " + topic);

                  //  Topic topic=topicList.replace("!","");


                }

        }

    }
