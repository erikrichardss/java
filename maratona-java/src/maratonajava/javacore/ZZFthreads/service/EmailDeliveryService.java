package maratonajava.javacore.ZZFthreads.service;

import maratonajava.javacore.ZZFthreads.domain.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " starting to deliver emails...");
        while (members.isOpen() || members.pendindEmails() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email.isEmpty()) continue;
                System.out.println(name + " enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(name + " enviou email com sucesso para " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso!");
    }
}
