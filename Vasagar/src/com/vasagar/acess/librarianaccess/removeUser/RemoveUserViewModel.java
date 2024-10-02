package com.vasagar.acess.librarianaccess.removeUser;

import com.vasagar.datalink.VasagarRepository;

class RemoveUserViewModel {
    private RemoveUser removeUser;

    RemoveUserViewModel(RemoveUser removeUser) {
        this.removeUser=removeUser;
    }

    public void removeUser(String userID, String userName) {
        if(VasagarRepository.getInstance().removeUserFromDB(userID,userName)) {
            removeUser.showSuccessfullMessage();
        }else{
            removeUser.showError();
        }
    }
}
