public class RestaurantManagementMain {
    // Restaurant Management Main class to test hybrid inheritance
    public static void main(String[] args) {
        // Creating instances of Chef and Waiter
        Person chef = new Chef("Gordon Ramsay", "C101", "Italian Cuisine");
        Person waiter = new Waiter("John Doe", "W202", "North Wing");

        // Displaying information and performing duties
        chef.displayPersonInfo();
        ((Worker) chef).performDuties();  // Performing duties for Chef
        System.out.println();

        waiter.displayPersonInfo();
        ((Worker) waiter).performDuties();  // Performing duties for Waiter
    }
}
