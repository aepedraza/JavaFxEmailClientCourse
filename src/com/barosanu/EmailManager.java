package com.barosanu;

import com.barosanu.controller.services.FetchFoldersService;
import com.barosanu.model.EmailAccount;
import com.barosanu.model.EmailTreeItem;
import javafx.scene.control.TreeItem;

public class EmailManager {

    //Folder handling:
    private EmailTreeItem foldersRoot = new EmailTreeItem("");

    public EmailTreeItem getFoldersRoot(){
        return foldersRoot;
    }

    public void addEmailAccount(EmailAccount emailAccount){
        EmailTreeItem treeItem = new EmailTreeItem(emailAccount.getAddress());
        FetchFoldersService fetchFoldersService = new FetchFoldersService(emailAccount.getStore(), treeItem);
        fetchFoldersService.start();
        foldersRoot.getChildren().add(treeItem);
    }
}
