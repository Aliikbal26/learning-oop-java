package oop.data;

public class SocialMedia {

    String name;
}

// final class agar tidak bisa diwariskan di kelas turunan
class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

// class FakeFacebook extends Facebook{

// }
