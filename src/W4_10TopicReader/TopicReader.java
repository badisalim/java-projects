package W4_10TopicReader;

import W4_7MapAdvancedIndexApplication.Topic;
import W4_9FileReader.FileReader ;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {

        private FileReader fileReader = new FileReader();

        public List<Topic> getTopics(String filePath) {
            List<Topic> topics = new ArrayList<>();
            Object robodog;
            List<String> lines = fileReader.asLines("W4_RobodogApplication/robodog/robodog.txt");
            for (String line : lines) {
                Topic topic = new Topic(line);
                topics.add(topic);


            }
            return topics;


        }

    }
