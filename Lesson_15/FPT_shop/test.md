## Internet Banking
Viết chương trình xây dựng ứng dụng  VPBank :

Bạn có thể thực hiện các công việc sau ngay trên ứng dụng VPBank Online:

- Truy vấn số dư tài khoản

- Chuyển tiền

- Xem lịch sử giao dịch

Tuy nhiên trước khi thực hiện được các công việc đó bạn cần tiến hành đăng nhập.

**1 Để đăng nhập cần số điện thoại và mật khẩu.**

**2 Truy vấn số dư tài khoản: Chỉ đơn giản là in thông tin số dư hiện tại của bạn**

**3 Chuyển tiền**

-  Nhập số tài khoản (stk phải đã có trong danh sách)

- Nhập số tiền bạn muốn chuyển (Số tiền muốn chuyển cần lớn hơn 50.000 và nhỏ hơn số dư tài khoản - 50.000 vì trong tài khoản luôn luôn dư ít nhất là 50.000)

Ví du: TK của bạn có 500.000 thì bạn chỉ được chuyển nhiều nhất là 450.000

- Nhập mô tả và tiến hành gửi tiền

Sau khi nhận thông báo chuyển tiền thành công sẽ lưu vào lịch sử giao dịch

**4 Lịch sử giao dịch**
Lịch sử giao dịch bao gồm các thông tin như mã giao dịch, ngày giao dịch, mô tả giao dịch,số tài khoản thụ hưởng, số tiền

VD:

1 - 15/6/2021 - Đóng tiền nhà - 58742546258 - 2.000.000

2 - 05/06/2021 - Nhận lương tháng 5 - 536974153 - 15.000.000

*Gợi ý: * Cần các thông tin:
- User(id, phoneNumber, password, account, balance)
- TransactionHistory (id, id_user, content, date, account, money)