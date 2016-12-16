package stoyanov.valentin.mycar.realm.models;

import java.util.Date;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Vehicle extends RealmObject {

    @PrimaryKey
    private String id;
    private String name;
    private Date manufactureDate;
    private int color;
    private int horsePower;
    private int cubicCentimeter;
    private long odometer;
    private VehicleType type;
    private Brand brand;
    private Model model;
    private String registrationPlate;
    private String vinPlate;
    private RealmList<FuelTank> fuelTanks;
    private RealmList<Service> services;
    private RealmList<Insurance> insurances;
    private RealmList<Expense> expenses;
    private RealmList<Refueling> refuelings;
    private RealmList<Reminder> reminders;
    private Note note;

    public Vehicle(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCubicCentimeter() {
        return cubicCentimeter;
    }

    public void setCubicCentimeter(int cubicCentimeter) {
        this.cubicCentimeter = cubicCentimeter;
    }

    public long getOdometer() {
        return odometer;
    }

    public void setOdometer(long odometer) {
        this.odometer = odometer;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public String getVinPlate() {
        return vinPlate;
    }

    public void setVinPlate(String vinPlate) {
        this.vinPlate = vinPlate;
    }

    public RealmList<FuelTank> getFuelTanks() {
        return fuelTanks;
    }

    public void setFuelTanks(RealmList<FuelTank> fuelTanks) {
        this.fuelTanks = fuelTanks;
    }

    public RealmList<Service> getServices() {
        return services;
    }

    public void setServices(RealmList<Service> services) {
        this.services = services;
    }

    public RealmList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(RealmList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public RealmList<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(RealmList<Expense> expenses) {
        this.expenses = expenses;
    }

    public RealmList<Refueling> getRefuelings() {
        return refuelings;
    }

    public void setRefuelings(RealmList<Refueling> refuelings) {
        this.refuelings = refuelings;
    }

    public RealmList<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(RealmList<Reminder> reminders) {
        this.reminders = reminders;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
