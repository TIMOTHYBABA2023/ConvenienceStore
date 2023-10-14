package Models;

import Enums.Qualification;
import Enums.Residence;
import Exceptions.NotHired;
import Exceptions.OutOfJurisdictionException;
import Services.ManagerServiceImpl;


import java.util.List;

public class Manager extends Staff implements ManagerServiceImpl {


    //Constructor field...

    public Manager() {
    }

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }



    public Manager(String firstName, String lastName, String gender, Residence residentialState) {
        super(firstName, lastName, gender, residentialState);
    }




    @Override
    public String toString() {
        return "Manager{} " + super.toString();
    }

    @Override
    public Cashier hireCashier(CashierApplicant cashierApplicant) {

        Cashier cashier = new Cashier();
        if ((cashierApplicant.getQualification().equals(Qualification.DEGREE)) &&
                ((cashierApplicant.getResidence().equals(Residence.ABUJA) ||
                        (cashierApplicant.getResidence().equals(Residence.KANO) ||
                                (cashierApplicant.getResidence().equals(Residence.LAGOS))))))
        {
            cashier.setFirstName(cashierApplicant.getFirstName());
            cashier.setLastName(cashierApplicant.getLastName());
            cashier.setGender(cashierApplicant.getGender());
            cashier.setResidentialState(cashierApplicant.getResidence());
            cashier.setId(cashier.getId()+1);

            System.out.println("Successful");
            return cashier;

        } else if ((cashierApplicant.getQualification().equals(Qualification.MASTERS)) &&
                ((cashierApplicant.getResidence().equals(Residence.ABUJA) ||
                        (cashierApplicant.getResidence().equals(Residence.KANO) ||
                                (cashierApplicant.getResidence().equals(Residence.LAGOS))))))
        {

            cashier.setFirstName(cashierApplicant.getFirstName());
            cashier.setLastName(cashierApplicant.getLastName());
            cashier.setGender(cashierApplicant.getGender());
            cashier.setResidentialState(cashierApplicant.getResidence());
            cashier.setId(cashier.getId()+1);

            System.out.println("Successful");
            return cashier;

        } else {
            System.out.println("Unsuccessful");
            return null;

        }

    }
}
