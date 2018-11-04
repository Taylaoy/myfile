package cn.pz.sort;

import java.util.ArrayDeque;
import java.util.Queue;

public class demo1 {
    public static void main(String[] args){
        Queue<Request> que=new ArrayDeque<Request>();
        for(int i=1;i<10;i++){
            final int num=i;
            que.offer(new Request(){
                @Override
                public void deposit() {
                    System.out.println("第"+num+"个人"+(Math.random())*10000);
                }
            });
        }
        deal(que);
    }
    public static void deal(Queue<Request> que){
        Request req=null;
        while(null!=(req=que.poll())){
            req.deposit();
        }
    }

}
interface Request{
    void deposit();
}
