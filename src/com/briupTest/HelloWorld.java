package com.briupTest;

import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        /**
         * 游戏目标：
         * 1.创建两个国家，一方由玩家操控，一方由电脑操控
         * 2.创建军队，玩家可以选择各种士兵来攻打对方，并扣除相应的血量和金钱
         */
        Scanner input=new Scanner(System.in);
        String[] jd={"小兵","将士","马车","大炮","狮子"};
        int[] xl={3,5,6,2,2};
        int[]jq={5,8,10,20,50};
        int[] gjl={2,4,5,13,25};
        int js=1;
        int cs=1;
        int gj=1;
        int wjxl=70;
        int wjjq=100;
        int dnxl=70;
        int dnjq=100;
        System.out.println("请问您的名字是什么？");
        String wjxm=input.next();
        System.out.println("想看介绍吗？(1 Y/2 N)");
        int YN=input.nextInt();
        if(YN==1){
            System.out.println("操作说明：");
            System.out.println("您一开始有70￥，这些钱可以用来购买士兵，来攻打对方的城堡和士兵。");
            System.out.println("当你或对方血量为零时，游戏结束。");
        }else if(YN==2){

        }
        while(js==1){
        try{
            System.out.println("欢迎,"+wjxm);
            System.out.println("您需要修改吗？(1 Y/2 N)");
            int yn=input.nextInt();
            if(yn==1){
                try{

                    System.out.println("请输入玩家血量");
                    int wjxl1=input.nextInt();
                    System.out.println("请输入玩家金钱");    
                    int wjjq1=input.nextInt();
                    System.out.println("请输入电脑血量");
                    int dnxl1=input.nextInt();
                    System.out.println("请输入电脑金钱");
                    int dnjq1=input.nextInt();
                System.out.println("兵种如下：");
                for(int xhcs=1;xhcs<=jd.length;xhcs++){
                    System.out.println(xhcs+"."+jd[(xhcs-1)]+",血量为"+xl[(xhcs-1)]+",攻击力为"+gjl[(xhcs-1)]+",需"+jq[(xhcs-1)]+"￥！");
                }
                while(js==1){
                    System.out.println("————————第"+cs+"场————————");

                    if(wjjq1<=0){
                        if(dnjq1<=0){
                        js++;
                        System.out.println("您还有金钱"+wjjq1+",城堡生命"+wjxl1+"。对方还有金钱"+dnjq1+",城堡生命"+dnxl1+".");
                        System.out.println("平局");
                        continue;
                        }
                    }
                    if(dnjq1<=0){
                        if(wjjq1<=0){
                        js++;
                        System.out.println("您还有金钱"+wjjq1+",城堡生命"+wjxl1+"。对方还有金钱"+dnjq1+",城堡生命"+dnxl1+".");
                        System.out.println("平局");
                        continue;
                        }
                    }
                    System.out.println("您还有金钱"+wjjq1+",城堡生命"+wjxl1+"。对方还有金钱"+dnjq1+",城堡生命"+dnxl1+".");
                    int bz=(int)(1+Math.random()*3);
                        if(dnjq1>=1){

                        for(int ccss=1;ccss<=jq[bz];ccss++){
                            dnjq1--;
                        }
                        System.out.println("对方使用了"+jd[bz]+"。");
                        dnjq1++;
                        dnjq1++;
                        for(int ccss=1;ccss<=xl[bz];ccss++){

                            dnxl1++;

                    }
                        for(int ccss=1;ccss<=gjl[bz];ccss++){

                                wjxl1--;

                        }
                        }
                        else if(dnjq1<=0){
                            System.out.println("对方没有金钱，无法出兵！！！");
                        }
                        if(dnxl1<=0){
                            js++;
                            System.out.println(wjxm+",你赢了！");
                        }else if(wjxl1<=0){
                            js++;
                            System.out.println(wjxm+",你输了！");
                        }
                        if(wjjq1>=1){
                        System.out.println("请输入兵种！(序号)");
                        int srbz=input.nextInt();
                        srbz--;
                        wjjq++;
                        wjjq++;
                        System.out.println("您使用了"+jd[srbz]+"。");
                        for(int ccss=1;ccss<=jq[srbz];ccss++){
                            wjjq1--;
                        }
                        for(int ccss=1;ccss<=xl[srbz];ccss++){  
                            wjxl1++;
                        }

                        for(int ccss=1;ccss<=gjl[srbz];ccss++){

                                dnxl1--;

                        }
                        }else if(wjjq1<=0){
                            System.out.println("您没有金钱，无法出兵！！！");
                        }
                        System.out.println("您还有金钱"+wjjq1+",城堡生命"+wjxl1+"。对方还有金钱"+dnjq1+",城堡生命"+dnxl1+".");
                    cs++;
                    if(dnxl1<=0){
                        js++;
                        System.out.println(wjxm+",你赢了！");
                    }else if(wjxl1<=0){
                        js++;
                        System.out.println(wjxm+",你输了！");
                    }

                }
            }catch(Exception e){
                 System.out.println("命令输入错误！请根据提示命令！");
                 }
            continue;
            }
        System.out.println("游戏结束。");

            System.out.println("兵种如下：");
            for(int xhcs=1;xhcs<=jd.length;xhcs++){
                System.out.println(xhcs+"."+jd[(xhcs-1)]+",血量为"+xl[(xhcs-1)]+",攻击力为"+gjl[(xhcs-1)]+",需"+jq[(xhcs-1)]+"￥！");
            }
            while(js==1){
                System.out.println("————————第"+cs+"场————————");
                if(wjjq<=0){
                    if(dnjq<=0){
                    js++;
                    System.out.println("平局");
                    continue;
                    }
                }
                if(dnjq<=0){
                    if(wjjq<=0){
                    js++;
                    System.out.println("平局");
                    continue;
                    }
                }

                int bz=(int)(1+Math.random()*3);
                    if(dnjq>=1){

                    for(int ccss=1;ccss<=jq[bz];ccss++){
                        dnjq--;
                    }
                    System.out.println("对方使用了"+jd[bz]+"。");
                    dnjq++;
                    dnjq++;
                    for(int ccss=1;ccss<=xl[bz];ccss++){

                        dnxl++;

                }
                    for(int ccss=1;ccss<=gjl[bz];ccss++){

                            wjxl--;

                    }
                    }
                    else if(dnjq<=0){
                        System.out.println("对方没有金钱，无法出兵！！！");
                    }
                    if(dnxl<=0){
                        js++;
                        System.out.println(wjxm+",你赢了！");
                    }else if(wjxl<=0){
                        js++;
                        System.out.println(wjxm+",你输了！");
                    }
                    if(wjjq>=1){
                    System.out.println("请输入兵种！(序号)");
                    int srbz=input.nextInt();
                    srbz--;
                    wjjq++;
                    wjjq++;
                    System.out.println("您使用了"+jd[srbz]+"。");
                    for(int ccss=1;ccss<=jq[srbz];ccss++){
                        wjjq--;
                    }
                    for(int ccss=1;ccss<=xl[srbz];ccss++){  
                        wjxl++;
                    }

                    for(int ccss=1;ccss<=gjl[srbz];ccss++){

                            dnxl--;

                    }
                    }else if(wjjq<=0){
                        System.out.println("您没有金钱，无法出兵！！！");
                    }
                    System.out.println("您还有金钱"+wjjq+",城堡生命"+wjxl+"。对方还有金钱"+dnjq+",城堡生命"+dnxl+".");
                cs++;
                if(dnxl<=0){
                    js++;
                    System.out.println(wjxm+",你赢了！");
                }else if(wjxl<=0){
                    js++;
                    System.out.println(wjxm+",你输了！");
                }

            }
        }catch(Exception e){
             System.out.println("命令输入错误！请根据提示命令！");
             }
        continue;
        }
    System.out.println("游戏结束。");
    }
}