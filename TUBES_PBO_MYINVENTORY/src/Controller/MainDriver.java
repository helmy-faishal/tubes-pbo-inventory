package Controller;

import View.*;

public class MainDriver {

    public static void main(String[] args) {
        MainMenuView menuView = new MainMenuView();
        TambahBarangView tambahView = new TambahBarangView();
        HapusBarangView hapusView = new HapusBarangView();
        EditBarangView editView = new EditBarangView();
        
        MainMenuController menu = new MainMenuController(menuView,tambahView,hapusView,editView);
        menu.show();
    }    
}
