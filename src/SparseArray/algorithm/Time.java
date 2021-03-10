package SparseArray.algorithm;

import java.util.*;

/**
 *
 * @author 爽
 */
public class Time {

    public static void main(String[] args) {
        List<TimeOne> list=new ArrayList<>(16);
        TimeOne timeOne1=new TimeOne(1,6);
        TimeOne timeOne2=new TimeOne(3,7);
        TimeOne timeOne3=new TimeOne(5,6);
        TimeOne timeOne4=new TimeOne(8,12);
        TimeOne timeOne5=new TimeOne(9,15);
        TimeOne timeOne6=new TimeOne(14,17);
//        TimeOne timeOne7=new TimeOne(120,130);
        list.add(timeOne1);
        list.add(timeOne2);
        list.add(timeOne3);
        list.add(timeOne4);
        list.add(timeOne5);
        list.add(timeOne6);
//        list.add(timeOne7);

        List<TimeOne> newOne=getSort(list);

        for (TimeOne timeOne:
             newOne) {
            System.out.println(timeOne.toString());
        }

        String content="作者大大123456，为你点赞";
        content=content.replaceAll("^[0-9]{6,10}$","");
        System.out.println(content);

    }







    public static List<TimeOne>  getSort(List<TimeOne> list){
        list.stream().sorted(Comparator.comparing(TimeOne::getBeginTime));
        if (list.size()<=1){
            return list;
        }
        int beginTime=list.get(0).getBeginTime();
        int endTime=list.get(0).getEndTime();
        boolean flag;
        List<TimeOne> result=new ArrayList<>(16);
        for (int i = 1; i < list.size() ; i++) {
            TimeOne indexTime=list.get(i);
            if (indexTime.getBeginTime() <= endTime){
                if (indexTime.getEndTime() > endTime){
                    endTime=indexTime.getEndTime();
                }
                flag=false;
            }else {
                flag=true;
            }
            if (flag){
                TimeOne timeOne=new TimeOne(beginTime,endTime);
                result.add(timeOne);
                beginTime=indexTime.getBeginTime();
                endTime=indexTime.getEndTime();
            }
            if (i==list.size()-1){
                result.add(indexTime);
            }
        }
        return result;
    }




    public static class TimeOne{

        /**
         * 开始时间戳
         */
        private int beginTime;

        /**
         * 结束时间戳
         */
        private int endTime;

        public int getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(int beginTime) {
            this.beginTime = beginTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        public TimeOne(int beginTime, int endTime) {
            this.beginTime = beginTime;
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return "TimeOne{" +
                    "beginTime=" + beginTime +
                    ", endTime=" + endTime +
                    '}';
        }
    }




}
