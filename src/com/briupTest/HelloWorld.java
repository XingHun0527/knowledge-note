package com.briupTest;

import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        /**
         * ��ϷĿ�꣺
         * 1.�����������ң�һ������Ҳٿأ�һ���ɵ��Բٿ�
         * 2.�������ӣ���ҿ���ѡ�����ʿ��������Է������۳���Ӧ��Ѫ���ͽ�Ǯ
         */
        Scanner input=new Scanner(System.in);
        String[] jd={"С��","��ʿ","��","����","ʨ��"};
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
        System.out.println("��������������ʲô��");
        String wjxm=input.next();
        System.out.println("�뿴������(1 Y/2 N)");
        int YN=input.nextInt();
        if(YN==1){
            System.out.println("����˵����");
            System.out.println("��һ��ʼ��70������ЩǮ������������ʿ����������Է��ĳǱ���ʿ����");
            System.out.println("�����Է�Ѫ��Ϊ��ʱ����Ϸ������");
        }else if(YN==2){

        }
        while(js==1){
        try{
            System.out.println("��ӭ,"+wjxm);
            System.out.println("����Ҫ�޸���(1 Y/2 N)");
            int yn=input.nextInt();
            if(yn==1){
                try{

                    System.out.println("���������Ѫ��");
                    int wjxl1=input.nextInt();
                    System.out.println("��������ҽ�Ǯ");    
                    int wjjq1=input.nextInt();
                    System.out.println("���������Ѫ��");
                    int dnxl1=input.nextInt();
                    System.out.println("��������Խ�Ǯ");
                    int dnjq1=input.nextInt();
                System.out.println("�������£�");
                for(int xhcs=1;xhcs<=jd.length;xhcs++){
                    System.out.println(xhcs+"."+jd[(xhcs-1)]+",Ѫ��Ϊ"+xl[(xhcs-1)]+",������Ϊ"+gjl[(xhcs-1)]+",��"+jq[(xhcs-1)]+"����");
                }
                while(js==1){
                    System.out.println("������������������"+cs+"������������������");

                    if(wjjq1<=0){
                        if(dnjq1<=0){
                        js++;
                        System.out.println("�����н�Ǯ"+wjjq1+",�Ǳ�����"+wjxl1+"���Է����н�Ǯ"+dnjq1+",�Ǳ�����"+dnxl1+".");
                        System.out.println("ƽ��");
                        continue;
                        }
                    }
                    if(dnjq1<=0){
                        if(wjjq1<=0){
                        js++;
                        System.out.println("�����н�Ǯ"+wjjq1+",�Ǳ�����"+wjxl1+"���Է����н�Ǯ"+dnjq1+",�Ǳ�����"+dnxl1+".");
                        System.out.println("ƽ��");
                        continue;
                        }
                    }
                    System.out.println("�����н�Ǯ"+wjjq1+",�Ǳ�����"+wjxl1+"���Է����н�Ǯ"+dnjq1+",�Ǳ�����"+dnxl1+".");
                    int bz=(int)(1+Math.random()*3);
                        if(dnjq1>=1){

                        for(int ccss=1;ccss<=jq[bz];ccss++){
                            dnjq1--;
                        }
                        System.out.println("�Է�ʹ����"+jd[bz]+"��");
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
                            System.out.println("�Է�û�н�Ǯ���޷�����������");
                        }
                        if(dnxl1<=0){
                            js++;
                            System.out.println(wjxm+",��Ӯ�ˣ�");
                        }else if(wjxl1<=0){
                            js++;
                            System.out.println(wjxm+",�����ˣ�");
                        }
                        if(wjjq1>=1){
                        System.out.println("��������֣�(���)");
                        int srbz=input.nextInt();
                        srbz--;
                        wjjq++;
                        wjjq++;
                        System.out.println("��ʹ����"+jd[srbz]+"��");
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
                            System.out.println("��û�н�Ǯ���޷�����������");
                        }
                        System.out.println("�����н�Ǯ"+wjjq1+",�Ǳ�����"+wjxl1+"���Է����н�Ǯ"+dnjq1+",�Ǳ�����"+dnxl1+".");
                    cs++;
                    if(dnxl1<=0){
                        js++;
                        System.out.println(wjxm+",��Ӯ�ˣ�");
                    }else if(wjxl1<=0){
                        js++;
                        System.out.println(wjxm+",�����ˣ�");
                    }

                }
            }catch(Exception e){
                 System.out.println("������������������ʾ���");
                 }
            continue;
            }
        System.out.println("��Ϸ������");

            System.out.println("�������£�");
            for(int xhcs=1;xhcs<=jd.length;xhcs++){
                System.out.println(xhcs+"."+jd[(xhcs-1)]+",Ѫ��Ϊ"+xl[(xhcs-1)]+",������Ϊ"+gjl[(xhcs-1)]+",��"+jq[(xhcs-1)]+"����");
            }
            while(js==1){
                System.out.println("������������������"+cs+"������������������");
                if(wjjq<=0){
                    if(dnjq<=0){
                    js++;
                    System.out.println("ƽ��");
                    continue;
                    }
                }
                if(dnjq<=0){
                    if(wjjq<=0){
                    js++;
                    System.out.println("ƽ��");
                    continue;
                    }
                }

                int bz=(int)(1+Math.random()*3);
                    if(dnjq>=1){

                    for(int ccss=1;ccss<=jq[bz];ccss++){
                        dnjq--;
                    }
                    System.out.println("�Է�ʹ����"+jd[bz]+"��");
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
                        System.out.println("�Է�û�н�Ǯ���޷�����������");
                    }
                    if(dnxl<=0){
                        js++;
                        System.out.println(wjxm+",��Ӯ�ˣ�");
                    }else if(wjxl<=0){
                        js++;
                        System.out.println(wjxm+",�����ˣ�");
                    }
                    if(wjjq>=1){
                    System.out.println("��������֣�(���)");
                    int srbz=input.nextInt();
                    srbz--;
                    wjjq++;
                    wjjq++;
                    System.out.println("��ʹ����"+jd[srbz]+"��");
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
                        System.out.println("��û�н�Ǯ���޷�����������");
                    }
                    System.out.println("�����н�Ǯ"+wjjq+",�Ǳ�����"+wjxl+"���Է����н�Ǯ"+dnjq+",�Ǳ�����"+dnxl+".");
                cs++;
                if(dnxl<=0){
                    js++;
                    System.out.println(wjxm+",��Ӯ�ˣ�");
                }else if(wjxl<=0){
                    js++;
                    System.out.println(wjxm+",�����ˣ�");
                }

            }
        }catch(Exception e){
             System.out.println("������������������ʾ���");
             }
        continue;
        }
    System.out.println("��Ϸ������");
    }
}