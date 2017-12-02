import java. util. *;
import java. text. *;
public class Task implements Runnable
{
    long n;
    String id;
    
    /*A recursive method*/
    private long fib(long n)
    {
        if (n == 0)
            return 0L;
        if (n == 1)
            return 1L;
        return fib(n - 1) + fib(n - 2);
    }

    /*A task method that takes n, the n'th element of the fibonacci series and a string for id*/
    // An initializer method
    public Task(long n, String id)
    {
        this. n = n;
        this. id = id;
    }

    public void run( )
    {
        Date d = new Date( );
        DateFormat df = new SimpleDateFormat("HH: mm: ss: SSS");
        long startTime = System. currentTimeMillis( );
        d. setTime(startTime);
        
        System. out. println("Starting task " + id + " at " + df. format(d));
        fib(n);
        long endTime = System. currentTimeMillis( );
        d. setTime(endTime) ;
        System. out. println("Ending task " + id + " at " +  df. format(d) + " after " + (endTime - startTime) + " milliseconds");
    
    }
}