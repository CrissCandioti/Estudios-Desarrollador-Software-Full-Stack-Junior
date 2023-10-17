/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

/**
 *
 * @author Criss Candioti
 */
class Area {

    private String sector;

    public Area(String sector) {
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Area{" + "sector=" + sector + '}';
    }

}
