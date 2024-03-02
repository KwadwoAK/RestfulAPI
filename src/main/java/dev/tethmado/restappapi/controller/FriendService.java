package dev.tethmado.restappapi.controller;

import dev.tethmado.restappapi.model.FriendVendor;
import org.springframework.web.bind.annotation.*;
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
}
