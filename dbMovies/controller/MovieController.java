package dbMovies;

import com.sun.jdi.event.MonitorContendedEnteredEvent;

import java.util.Scanner;

public class Controller {
    Service service = new Service();
    Scanner scanner = new Scanner(System.in);
    int id = 0;

    public void start() {
        int count = 0;
        while (count < 5) {
            System.out.println("What do you want to do?\n" + "Create new movie --1" +
                    "\nRead all movies --2 \n" + "Read movie by id --3 \n" + "Update --4 \n" + "Delete --5");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    create();
                    count++;
                    break;
                case 2:
                    readAll();
                    count++;
                    break;
                case 3:
                    readById();
                    count++;
                    break;
                case 4:
                    try {
                        update();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Input valid id");
                        update();
                    }
                    count++;
                    break;
                case 5:
                    delete();
                    count++;
                    break;
            }
        }
    }

    void update() {
        System.out.println("Input id");
        int i = scanner.nextInt();
        System.out.println("Input updated name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Input updated genre");
        String genre = scanner.nextLine();
        System.out.println("Input updated description");
        String desc = scanner.nextLine();
        System.out.println("Input updated rating (count of stars)");
        int stars = scanner.nextInt();
        MovieRequest movieRequest = new MovieRequest(id, name, genre, desc, stars);
        service.update(movieRequest, i);
    }

    void readAll() {
        service.readAll();
    }

    void delete() {
        System.out.println("Input index");
        int i = scanner.nextInt();
        service.delete(i);
    }

    void readById() {

        System.out.println("Input id");
        int i = scanner.nextInt();
        service.readById(i);
    }

    void create() {
        System.out.println("Input name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Input genre");
        String genre = scanner.nextLine();
        System.out.println("Input description");
        String desc = scanner.nextLine();
        System.out.println("Input rating (count of stars)");
        int stars = scanner.nextInt();
        MovieRequest movieRequest = new MovieRequest(generateId(), name, genre, desc, stars);
        service.createMovie(movieRequest);
    }

    int generateId() {
        return id++;
    }
}
