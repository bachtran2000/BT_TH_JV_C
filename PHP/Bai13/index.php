<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bài 13 - Kỹ thuật lập trình</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>

    <style type="text/css">
        * {
            transition: ease 1.25s;
            margin: 0px;
            padding: 0px;
        }
        h2 {
            text-align: center;
        }
        table th {
            text-align: right;
            font-weight: bolder;
            padding-right: 10px;
        }
        .required {
            font-weight: bold;
            color: #ff0000;
            font-size: larger;
        }
        p {
            text-align: justify;
        }
        .row {
            width: 100% !important;
        }
    </style>
</head>
<body class="jumbotron">

<h2 class="text text-info">
    <?php
    if (isset($_POST['txtName'])) {
        ?>
        <span class="glyphicon glyphicon-check"></span> Thông tin đăng kí
    <?php
    } else {
        ?>
        <span class="glyphicon glyphicon-edit"></span> Đăng kí
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
                Bạn đã gửi đăng kí với thông tin:
                <ul>
                <li>Địa chỉ: <b><?php echo $_POST['txtAdd']; ?></b></li>
                <?php
                if(isset($_POST['txtJob']))
                ?>
                    <li>Nghề nghiệp: <b><?php echo $_POST['txtJob']; ?></b></li>
                <?php
                if(isset($_POST['txaNote']))
                ?>
                    <li>Ghi chú: <b><?php echo $_POST['txaNote']; ?></b></li>
                </ul>
            </p>
            <a href="bai13.php" target="_top" class="btn btn-success form-control">Đăng kí lại</a>
        <?php
        } else {
            ?>
            <form action="#" method="post" name="frmReg">
                <table class="table table-hover">
                    <tr>
                        <th>Họ tên <span class="required">*</span></th>
                        <td>
                            <input class="form-control" type="text" id="txtName" name="txtName" placeholder="Nguyễn Văn An" required>
                        </td>
                    </tr>
                    <tr>
                        <th>Địa chỉ <span class="required">*</span></th>
                        <td>
                            <input class="form-control" type="text" id="txtAdd" name="txtAdd" placeholder="" required>
                        </td>
                    </tr>
                    <tr>
                        <th>Nghề nghiệp</th>
                        <td>
                            <input class="form-control" type="text" id="txtJob" name="txtJob" placeholder="Sinh viên">
                        </td>
                    </tr>
                    <tr>
                        <th>Ghi chú</th>
                        <td>
                            <textarea class="form-control" id="txaNote" name="txaNote" rows="3" cols="25"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <th>
                            <button class="btn btn-sm btn-default" type="reset">Làm lại</button>
                        </th>
                        <td>
                            <button class="btn btn-info form-control" type="submit"><b>Đăng kí</b></button>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>
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

</body>
</html>