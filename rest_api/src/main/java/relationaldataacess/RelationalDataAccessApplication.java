package relationaldataacess;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RelationalDataAccessApplication implements CommandLineRunner {
   public static void main(String[] args){
      SpringApplication.run(RelationalDataAccessApplication.class,args);
   }
   @Override
   public void run(String... args) throws Exception {
   }
}