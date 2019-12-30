package com.github.tenx.tecnoesis20;

import com.github.tenx.tecnoesis20.data.models.ModuleBody;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static List<ModuleBody> moduleList;

    public static List<ModuleBody> getModules(){
        moduleList = new ArrayList<>();
        List<ModuleBody.EventBody> eventList = new ArrayList<>();
        eventList.add(new ModuleBody.EventBody("Event 1" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "https://picsum.photos/411", "23rd Oct @Autidorium", "","767"));
        eventList.add(new ModuleBody.EventBody("Event 2" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "https://picsum.photos/412", "23rd Oct @Autidorium", "","7867"));
        eventList.add(new ModuleBody.EventBody("Event 3" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "https://picsum.photos/413", "23rd Oct @Autidorium", "","65675"));
        eventList.add(new ModuleBody.EventBody("Event 4" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "https://picsum.photos/414", "23rd Oct @Autidorium", "","7665"));
        eventList.add(new ModuleBody.EventBody("Event 5" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "https://picsum.photos/415", "23rd Oct @Autidorium", "","76675"));

        moduleList.add(new ModuleBody("Robotron 1" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "https://picsum.photos/300" , eventList));
        moduleList.add(new ModuleBody("Robotron 2" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "https://picsum.photos/301" , eventList));
        moduleList.add(new ModuleBody("Robotron 3" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "https://picsum.photos/302", eventList));
        moduleList.add(new ModuleBody("Robotron 4" , "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sapien velit, aliquet eget commodo nec, auctor a sapien. Nam eu neque vulputate diam rhoncus faucibus. Curabitur quis varius libero. Lorem." , "https://picsum.photos/303", eventList));

        return moduleList;


    }

}
