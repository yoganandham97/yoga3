import java.util.*;
class mins
{
    public static void main(String args[])
    {
        //int Date;
Date d1 = new Date();
Date d2 = new Date();
long diffMs = d1.getTime() - d2.getTime();
long diffSec = diffMs / 1000;
long min = diffSec / 60;
long sec = diffSec % 60;
System.out.println("the date "+min+" minutes and "+sec+" seconds.");
}
}

