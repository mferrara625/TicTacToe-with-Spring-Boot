package com.Game.TicTacToeSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GameController {
    AtomicLong counter = new AtomicLong();
    Game game;
    String resetLink = "<br> <br> <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"/\">RESET</a>";

    @GetMapping("/")
    public String welcomeScreen(){
        game = new Game();
        return game.toString();
    }

    @GetMapping("/1")
    public String topLeft(){
        if(counter.incrementAndGet() % 2 == 0){
            game.a1 = "x";
        }
        else
            game.a1 = "o";

        return game + resetLink;
    }

    @GetMapping("/2")
    public String topMiddle(){
        if(counter.incrementAndGet() % 2 == 0){
            game.a2 = "x";
        }
        else
            game.a2 = "o";

        return game + resetLink;
    }

    @GetMapping("/3")
    public String topRight(){
        if(counter.incrementAndGet() % 2 == 0){
            game.a3 = "x";
        }
        else
            game.a3 = "o";

        return game + resetLink;
    }

    @GetMapping("/4")
    public String middleLeft(){
        if(counter.incrementAndGet() % 2 == 0){
            game.a4 = "x";
        }
        else
            game.a4 = "o";

        return game + resetLink;
    }

    @GetMapping("/5")
    public String middle(){
        if(counter.incrementAndGet() % 2 == 0){
            game.a5 = "x";
        }
        else
            game.a5 = "o";

        return game + resetLink;
    }

    @GetMapping("/6")
    public String middleRight(){
        if(counter.incrementAndGet() % 2 == 0){
            game.a6 = "x";
        }
        else
            game.a6 = "o";

        return game + resetLink;
    }

    @GetMapping("/7")
    public String bottomLeft(){
        if(counter.incrementAndGet() % 2 == 0){
            game.a7 = "x";
        }
        else
            game.a7 = "o";

        return game + resetLink;
    }

    @GetMapping("/8")
    public String bottomMiddle(){
        if(counter.incrementAndGet() % 2 == 0){
            game.a8 = "x";
        }
        else
            game.a8 = "o";

        return game + resetLink;
    }

    @GetMapping("/9")
    public String bottomRight(){
        if(counter.incrementAndGet() % 2 == 0){
            game.a9 = "x";
        }
        else
            game.a9 = "o";

        return game + resetLink;
    }
}
