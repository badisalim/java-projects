package NFileReader;

import MapAdvancedIndexApplication.TopicClass;
import MFileReader.FileReader ;

import java.util.ArrayList;
import java.util.List;

public class TopicReader1 {

        private FileReader fileReader = new FileReader();

        public List<TopicClass> getTopics(String filePath) {
            List<TopicClass> topics = new ArrayList<>();
            List<String> lines = fileReader.asLines("NFileReader/topics.txt");
            for (String line : lines) {
                TopicClass topic = new TopicClass(line);
                topics.add(topic);


            }
            return topics;


        }

    }
