package project.redbird;

import java.util.Random;
import java.util.Scanner;




public class redbird {
    public static void main(String[] args) {
        //開始數據
        int Power = 0; //力量
        int intel = 0; //智力(intelligence)
        int defense = 0; //防禦
        int life = (Power*2)+10; //生命上限
        int attack = life / 5; //攻擊
        int magic = (intel*2)+10; //魔力上限
        int glift = life; //生命
        int gmagic = magic; //魔力
        int medi = 0; //藥
        int level = 1;//等級
        int exp2 = 10;
        int exp = 0;
        String skill = "沒有";//裝備技能

        boolean p01sleep = false;//睡眠
        
        var input = new Scanner(System.in);
        new Random();
        
        
        int run = 0;
        while(run < 2){ //開始
            
            System.out.println("1.地圖 2.背包 3.人物 4.等級 5.儲存 6.讀取");//菜單
            System.out.print("動作 :");
            var action = input.nextLine(); //菜單動作
            System.out.println("");
            
            
            switch (action){
                
                case "1": //地圖
                    
                    System.out.println("1.菜單 2.近郊");
                    System.out.print("動作 :");
                    var mapaction = input.nextLine();//地圖動作
                    System.out.println("");
                    
                    switch (mapaction){
                        case "1"://回菜單
                            break;

                        case "2"://進入近郊
                            System.out.println("以進入近郊");
                            System.out.println("");
                            
                            for( ; ; ){
                                System.out.println("近郊 : 1.菜單 2.探索");
                                System.out.print("動作 :");
                                var mapaction0 = input.nextLine();//地圖動作
                                System.out.println("");
                                if(exp>exp2){
                                    exp = exp-exp2;
                                    level ++;
                                    exp2 += 5;
                                }
                                switch (mapaction0){
                                    
                                    case "1"://回菜單
                                    break;

                                    case "2"://探索
                                        var find = (int)(Math.random()*2);
                                        switch (find){
                                            case 0: //找到了一顆草藥
                                                medi = medi + 1;
                                                System.out.println("你找到了一顆草藥");
                                                System.out.println("草藥X"+medi);
                                                System.out.printf("請按Enter");
                                                input.nextLine();
                                                System.out.println("");
                                                break;

                                            case 1://遇怪野獸(p01)
                                                int p01lift = (level+(int)(Math.random()*4))+3;
                                                for(; ; ){
                                                    if (p01lift<=0){
                                                        System.out.println("you win");
                                                        exp = exp +4;
                                                        break;
                                                    }
                                                    System.out.println("-------------");
                                                    System.out.println("'野獸' : 生命:"+p01lift);
                                                    System.out.println("");
                                                    System.out.print("'你' : 生命:"+glift+" ");
                                                    System.out.println("魔力"+gmagic);
                                                    System.out.println("-------------");
                                                    System.out.println("");
                                                    if (p01sleep == true){
                                                        System.out.println("1.逃跑 2.攻擊 3.魔法");
                                                        System.out.print("動作 :");
                                                        var mapactionp01 = input.nextLine();
                                                        System.out.println("");

                                                        switch(mapactionp01){
                                                            case "1":
                                                            break;

                                                            case "2":
                                                                System.out.println("擊中");
                                                                p01lift = p01lift - (attack+(int)(Math.random()*3));
                                                                p01sleep = false;
                                                                continue;

                                                            case "3":
                                                                System.out.println("1.返回 2.睡眠 3."+skill);
                                                                System.out.print("動作 :");
                                                                var amagic = input.nextLine();
                                                                switch (amagic){
                                                                    case "1":
                                                                        break;
                                                                    
                                                                    case "2":
                                                                        if (glift< 5){
                                                                            System.out.println("你沒有足夠的魔力");
                                                                            break;
                                                                        }else{  
                                                                            gmagic = gmagic -5;
                                                                            p01sleep = true;

                                                                    
                                                                        }
                                                                    case "3":
                                                                }
                                                            }
                                                        

                                                    }else{
                                                        System.out.println("1.逃跑 2.攻擊 3.魔法");
                                                        System.out.print("動作 :");
                                                        var mapactionp01 = input.nextLine();
                                                        System.out.println("");

                                                        switch (mapactionp01){
                                                            case "1"://逃跑
                                                                int leftp01 = (int)(Math.random()*4);
                                                                if (leftp01 < 2){
                                                                
                                                                    System.out.println("逃跑失敗");
                                                                    int p01 = (int)(Math.random()*4);
                                                                    int p01act = (int)(Math.random()*4);
                                                                    if (p01 < 1){
                                                                        continue;
                                                                    }else{
                                                                        glift = glift - p01act;
                                                                        System.out.println("你的生命"+"-"+p01act);
                                                                        continue;
                                                                    }
                                                        
                                                                }else{
                                                                    System.out.println("逃跑成功");
                                                                    break;
                                                                }

                                                            case "2"://擊中
                                                                int attackp01 = (int)(Math.random()*4);
                                                                    if (attackp01 <= 3){
                                                                        System.out.println("擊中");
                                                                        p01lift = p01lift - (attack+(int)(Math.random()*3));
                                                                    }else{//不擊中
                                                                        System.out.println("擊不中");
                                                                    }
                                                                    int p01 = (int)(Math.random()*4);
                                                                    int p01act = (int)(Math.random()*4);
                                                                    if (p01 < 1){
                                                                    continue;
                                                                    }else{
                                                                        glift = glift - p01act;
                                                                        System.out.println("你的生命"+"-"+p01act);
                                                                        continue;
                                                                    }

                                                            case "3"://魔法
                                                                    System.out.println("1.返回 2.睡眠 3."+skill);
                                                                    System.out.print("動作 :");
                                                                    var amagic = input.nextLine();
                                                                    switch (amagic){
                                                                        case "1":
                                                                            break;
                                                                    
                                                                        case "2":
                                                                            if (glift< 5){
                                                                                System.out.println("你沒有足夠的魔力");
                                                                                break;
                                                                            }else{  
                                                                                gmagic = gmagic -5;
                                                                                p01sleep = true;
                                                                                continue;
                                                                            }
                                                                        
                                                                        case "3":
                                                                        
                                                        }
                                                    }
                                                    
                                                                
                                                        
                                                    }
                                                    break;
                                                }
                                                break;
                                            
                                            default: //什麼都沒找到
                                                System.out.println("什麼都沒找到");
                                                System.out.printf("請按Enter");
                                                input.nextLine();
                                                System.out.println("");
                                                break;

                                        }
                                    continue;


                                }
                                break;
                            }
                            
                        default:
                            continue;
                    }
                    
                    break;

                case "2": //背包
                    System.out.println("1.菜單 2道具");
                    System.out.print("動作 :");
                    var backaction = input.nextLine(); //背包動作
                    System.out.println("");
                    switch (backaction){
                    
                        case "1"://回菜單
                            break;

                        case "2":
                            System.out.println("道具"); //道具背包
                            System.out.println("------------");
                            System.out.println("1.草藥X"+medi);
                            System.out.println("------------");
                            System.out.println("0.菜單");
                            System.out.print("動作 :");
                            var use = input.nextLine();
                            switch (use){
                                case "0":
                                    break;

                                case "1":
                                    if (glift >= life){
                                        System.out.println("不能用");

                                    }else{
                                        if(medi<0){
                                            System.out.println("不能用");
                                        
                                        }else{
                                            medi = medi - 1;
                                            glift = glift +1;
                                            System.out.println("'你' : 生命:"+"+"+1);
                                        }
                                    }
                            }
                            break;
                        
                        default:
                            continue;
                        
                    }
                    break;


                case "3": //人物
                    
                    for( ; ; ){
                        System.out.println("力量"+life);
                        System.out.println("智力"+magic);
                        System.out.println("防禦"+defense);
                        System.out.println("1.菜單");
                        System.out.print("動作 :");
                        var whoaction = input.nextLine();//人物動作
                        System.out.println("");
                        
                        System.out.println("");
                        switch (whoaction){
                            case "1"://回菜單
                                break;
                            
                            default:
                                continue;
                        }
                        break;

                    }

                    break;

                case "4":
                    System.out.println("tour level :"+level);
                    System.out.println("exp : " + exp +"/"+exp2);
                    

                    System.out.println("");
                    break;

                default:
                    continue;
            }
        }
        
        input.close();
        
            
    
    }
    
}