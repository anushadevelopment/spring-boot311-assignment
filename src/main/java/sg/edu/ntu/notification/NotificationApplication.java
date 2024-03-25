package sg.edu.ntu.notification;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class NotificationApplication {

	NotificationService notificationService;
	public NotificationApplication(NotificationService notificationService){
		this.notificationService = notificationService;
	}
	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

	//Channel channel;
    //Message message;

	 //= new NotificationService(channel,message);

	@PostConstruct
	public void init(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String to = scanner.nextLine();
		System.out.println("Enter message: ");
		String message = scanner.nextLine();		
		scanner.close();
		notificationService.setup(to, message);
		notificationService.send();
	}

}
