package dz.start.services;

import dz.start.models.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MEDJDOUB SEIFEDDINE on 16/03/2017.
 */
//it's a singleton
@Service
public class TopicService {

    private List<Topic> topics=new ArrayList<>(Arrays.asList(
            new Topic("Spring","Spring framework 1","spring Framework description 1"),
            new Topic("CPLUSPLUD","Spring framework 2","spring Framework description 2"),
            new Topic("js","Spring framework 3","spring Framework description 3")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
