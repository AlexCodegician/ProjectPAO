package components;

import java.util.*;

public class MarketServices {
    private ArrayList<Stock> stocks;
    private List<Distributor> distributors;
    private List<Order> orders;
    private List<Employee> employees;
    private final Map<Integer, Runnable> commands = new HashMap<>();

    private final String[] AdminActions = {
            "Adauga angajat: ", "Afiseaza angajati: ", "Plaseaza comanda: ", "Adauga distribuitor: ",
            "Afiseaza distribuitori: ", "Lichideaza stocul"
    };

    public int getInput()
    {
        Scanner scn = new Scanner(System.in);
        int opt = 0;
        try
        {
            opt = scn.nextInt();
            if(opt > commands.size())
                throw new Exception("Numar invalid!");

        }
        catch(Exception e)
        {
            System.out.println("Numar invalid! Reincercati: ");

            return getInput();
        }
        return opt;
    }

    public void startDialog()
    {
        int opt = 1;
        while(opt != 0)
        {
            this.displayInfo();
            System.out.println("Selectati o optiune: ");
            opt = getInput();
            if(opt != 0)
                commands.get(opt).run();
            //this.getConfirmation();
        }
    }

    public void displayInfo()
    {
        for(int i = 0; i < AdminActions.length; i++)
            System.out.println((i+1) + "." + AdminActions[i]);

        System.out.println("0. Inchide aplicatia");
    }

    public MarketServices()
    {
        stocks = new ArrayList<Stock>();
        distributors = new ArrayList<Distributor>();
        orders = new ArrayList<Order>();
        employees = new ArrayList<Employee>();
        commands.put(1, () -> addEmployee());
        commands.put(2, () -> showEmployees());
        commands.put(3, () -> placeAnOrder());
        commands.put(4, () -> addDistributor());
        commands.put(5, () -> showDistributors());
        commands.put(6, () -> liquidateTheStock());
    }

    private void addEmployee() {
        Employee newEmployee = new Employee();
        employees.add(newEmployee);
    }

    private void showEmployees() {
        for (int i = 0; i < employees.size(); i++)
        {
            System.out.println(employees.get(i));
        }
    }

    private void placeAnOrder() {
        Order newOrder = new Order();
        orders.add(newOrder);
    }

    private void addDistributor() {
        Distributor newDistributor = new Distributor();
        distributors.add(newDistributor);
    }

    private void showDistributors() {
        for (int i = 0; i < distributors.size(); i++)
        {
            System.out.println(distributors.get(i));
        }
    }

    private void liquidateTheStock() {
        Date date = new Date();
        for (int i = 0; i < stocks.size(); i++)
        {
            if (stocks.get(i).getLiquidationDate() == date)
            {
                for (int j = 0; j < stocks.get(i).getProductsInStock().size(); j++)
                {
                    stocks.get(i).getProductsInStock().clear();
                }
            }
        }
    }
}
