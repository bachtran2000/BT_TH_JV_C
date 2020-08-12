<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bài 15 - Kỹ thuật lập trình</title>
   


</head>
<body class="jumbotron">

<h2 class="text text-info">
    <?php
    if (isset($_POST['txtName'])) {
        ?>
        <span class="glyphicon glyphicon-check"></span> Đăng kí thành công
        <?php
    } else {
        ?>
        <span class="glyphicon glyphicon-edit"></span> Mẫu đăng kí
        <?php
    }
    ?>
</h2>

<section class="row">
    <section class="col-md-4"></section>
    <section class="col-md-4"><div class="well well-lg">
            <?php
            if (isset($_POST['txtName'])) {
                ?>
                <p>
                    Xin chào <b><?php echo $_POST['txtName']; ?></b>!<BR/>
                    Bạn đã gửi đăng kí thành công!
                </p>
                <a href="index.php" target="_top" class="btn btn-success form-control">Đăng kí lại</a>
                <?php
            } else {
                ?>
                <form action="#" method="post" name="frmReg" id="frmReg">
                    <table class="table table-hover">
                        <tr>
                            <th>Mã SV <span class="required">*</span></th>
                            <td>
                                <input class="form-control" type="text" id="txtID" name="txtID" placeholder="AT15xxyy" onchange="autoGetClass()" required>
                            </td>
                        </tr>
                        <tr>
                            <th>Họ tên <span class="required">*</span></th>
                            <td>
                                <input class="form-control" type="text" id="txtName" name="txtName" placeholder="Trần Cao Minh Bách" required>
                            </td>
                        </tr>
                        <tr>
                            <th>Ngày sinh <span class="required">*</span></th>
                            <td>
                                <input class="form-control" type="text" id="txtDOB" name="txtDOB" placeholder="dd/mm/yyyy" required>
                            </td>
                        </tr>
                        <tr>
                            <th>Giới tính <span class="required">*</span></th>
                            <td>
                                <input type="radio" id="rdoMale" name="rdoGender"><label for="rdoMale">Nam</label>
                                &nbsp;&nbsp;&nbsp;
                                <input type="radio" id="rdoFemale" name="rdoGender"><label for="rdoFemale">Nữ</label>
                                &nbsp;
                                <span class="" id="rdoAlert"></span>
                            </td>
                        </tr>
                        <tr>
                            <th>Nơi sinh <span class="required">*</span></th>
                            <td>
                                <input class="form-control" type="text" id="txtPlace" name="txtPlace" placeholder="Đà Nẵng" required>
                            </td>
                        </tr>
                        <tr>
                            <th>Lớp <span class="required">*</span></th>
                            <td>
                                <input class="form-control" type="text" id="txtClass" name="txtClass" placeholder="AT15B" required>
                            </td>
                        </tr>
                        <tr>
                            <th>
                                <button class="btn btn-info form-control" type="button" onclick="validate()"><b>Đăng kí</b></button>
                            <th/>
                            <td>
                                <button class="btn btn-sm btn-default" type="reset">Làm lại</button>
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td>
                                <b><span class="text text-danger" id="error-msg"></span></b>
                                <BR>
                                <span class="text text-muted"><span class="required">*</span> Mục bắt buộc</span>
                            </td>
                        </tr>
                    </table>
                </form>
                <?php
            }
            ?>
        </div></section>
    <section class="col-md-4"></section>
</section>

<script type="text/javascript">
    function autoGetClass() {
        document.getElementById("txtID").value = document.getElementById("txtID").value.toUpperCase();
        var classID = "";
        var c = document.getElementById("txtID").value;
        if (c.length>=3) {
            classID = c.substr(0,4);
            if (c.length>4) {
                switch (c.substr(4,2)) {
                    case "01":
                        classID+="A";
                        break;
                    case "02":
                        classID+="B";
                        break;
                    case "03":
                        classID+="C";
                        break;
                    case "04":
                        classID+="D";
                        break;
                    case "05":
                        classID+="E";
                        break;
                    default:
                        break;
                }
            }
        }
        document.getElementById("txtClass").value = classID;
    }
    function validate() {
        var e  =false;
        if (!document.getElementById("txtID").value.match(/[A-Z]{1,2}[0-9]{3,}/i)) {
            e = true;
            document.getElementById("txtID").className = "form-control alert-danger";
        } else {
            document.getElementById("txtID").className = "form-control";
        }

        if (document.getElementById("txtName").value.length < 5) {
            e = true;
            document.getElementById("txtName").className = "form-control alert-danger";
        } else {
            document.getElementById("txtName").className = "form-control";
        }

        if (!document.getElementById("txtDOB").value.match(/([0-9]{2}[/]){2}[1-2][0-9]{3}/)) {
            e = true;
            document.getElementById("txtDOB").className = "form-control alert-danger";
        } else {
            document.getElementById("txtDOB").className = "form-control";
        }

        if ( !(document.getElementById("rdoMale").checked || document.getElementById("rdoFemale").checked) ) {
            e = true;
            document.getElementById("rdoAlert").className = "glyphicon glyphicon-alert text text-danger";
        } else {
            document.getElementById("rdoAlert").className = "";
        }

        if (document.getElementById("txtPlace").value.length == 0) {
            e = true;
            document.getElementById("txtPlace").className = "form-control alert-danger";
        } else {
            document.getElementById("txtPlace").className = "form-control";
        }

        if (document.getElementById("txtClass").value.length < 3) {
            e = true;
            document.getElementById("txtClass").className = "form-control alert-danger";
        } else {
            document.getElementById("txtClass").className = "form-control";
        }

        if (e) {
            document.getElementById("error-msg").innerText = "Xin mời kiểm tra lại!";
        } else {
            document.getElementById("frmReg").submit();
        }
    }
</script>

</body>
</html>