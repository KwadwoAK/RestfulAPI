package dev.tethmado.restappapi.controller;

import dev.tethmado.restappapi.model.FriendVendor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
@RestController
@RequestMapping("/friendvendor")
public class FriendService {

    FriendVendor friend;


    @GetMapping("{friendId}")
    public FriendVendor getFriendVendorDetails( @PathVariable String friendId){
        return friend;
    }

    @PostMapping
    public String addFriend(@RequestBody FriendVendor friend){
        this.friend =friend;
        return "Friend Added";
    }

    @PutMapping
    public String updateFriend(@RequestBody FriendVendor friend){
        this.friend=friend;
        return "friend updated";
    }

    @DeleteMapping("{friendId}")
    public String DeleteFriend(String friendId){
        this.friend=null;
        return "friend deleted";
    }

    @GetMapping("/config")
    public String ListEnv(){
        StringBuilder sb = new StringBuilder();
        Map<String, String> envMap = System.getenv();

        for (String envName : envMap.keySet()) {
            sb.append(envName);
            sb.append(" = ");
            sb.append(envMap.get(envName));
            sb.append("\n");
        }
        return sb.toString();
    }

    @RequestMapping(value = "/fib", method = RequestMethod.GET)
    public String generateFibonacci(@RequestParam("length") int length){
        List<Integer> fib = new ArrayList<>();

        int num1 = 0, num2 = 1;

        for (int i = 0; i < length; i++) {
            // Print the number
            fib.add(num1);

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

        }


        return fib.toString();
    }


}
