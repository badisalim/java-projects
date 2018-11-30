package NFileReader;

import MapAdvancedIndexApplication.Topic;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class TopicReaderApplication {

        public static void main(String[] args) {
            TopicReader topicReader = new TopicReader();
            List<Topic> topicList = topicReader.getTopics("NFileReader/topics.txt");
            for (Topic topic : topicList) {
                System.out.println("Topic list: " + topic);
            }

            Set<Topic> topicSet = new HashSet<>(topicList);
            for (Topic topic : topicSet) {
                System.out.println("Topic set : " + topic);


            }
        }


    }
