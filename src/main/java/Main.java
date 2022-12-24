public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.id = 1;
        post.birthday = new FormDate();
        post.birthday.day = 20;
        post.birthday.month = 11;
        post.birthday.year = 1991;
        post.name = "Сергей";
        post.passport = "1234 № 123456";
        post.patronymic = "Иванович";
        post.phone = "+7 (908)-911-11-11";
        post.surname = "Меньшиков";
        post.subscription = true;
    }
}
