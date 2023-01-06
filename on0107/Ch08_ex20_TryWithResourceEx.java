package on0107;

public class Ch08_ex20_TryWithResourceEx {
    public static void main(String[] args) {
        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);
        }catch(WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }
        System.out.println();

         try(CloseableResource cr = new CloseableResource()){
                 cr.exceptionWork(true);
         }catch (WorkException e){
             e.printStackTrace();
         }catch (CloseException e){
             e.printStackTrace();
         }
    }
}
class CloseableResource implements AutoCloseable {
    public static void exceptionWork(boolean exception) throws WorkException {
        System.out.println("execptionWork("+exception+") is called");
        if(exception){
            throw new WorkException("WorkException !!");}
    }
    public void close() throws CloseException{
        System.out.println("Close() is called");
        throw new CloseException("CloseException!!!");
    }
}
class WorkException extends Exception{
    WorkException(String msg){ super(msg);}
}
class CloseException extends Exception{
    CloseException(String msg){ super(msg);}
}