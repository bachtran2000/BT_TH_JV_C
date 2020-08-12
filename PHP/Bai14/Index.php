<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bài 14 - Kỹ thuật lập trình</title>
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
        p {
            text-align: justify;
        }
        .row {
            width: 100% !important;
        }
    </style>
</head>
<body class="jumbotron">

<div class="row">
    <h2 class="text text-info"><span class="glyphicon glyphicon-globe"></span> Vẽ bảng</h2>
    <div class="col-md-4">&nbsp;</div>
    <div class="col-md-4 well well-lg">
        <?php
        if (!isset($_GET['col']) || !isset($_GET['row'])) { ?>
        <form action="#" method="get" name="frmDraw">
            <table class="table table-responsive">
                <tr>
                    <th>Số hàng</th>
                    <td>
                        <input type="number" name="row" class="form-control" required>
                    </td>
                </tr>
                <tr>
                    <th>Số cột</th>
                    <td>
                        <input type="number" name="col" class="form-control" required>
                    </td>
                </tr>
                <tr>
                    <td><button class="btn btn-default" type="reset">Xóa</button></td>
                    <td><button class="btn btn-info form-control" type="submit"><b>Vẽ bảng</b></button></td>
                </tr>
            </table>
        </form>
        <?php
        } else { ?>
        <table class="table table-bordered">
            <?php
            for ($i=1; $i<=$_GET['row']; $i++) {
                echo "<tr>";
                for ($j=1; $j<=$_GET['col']; $j++) {
                    echo "<td>";
                    
                    
                        echo "&nbsp;";
                    
                    echo "</td>";
                }
                echo "</tr>";
            }
            ?>
        </table>
        <a href="bai14.php" target="_top" class="btn btn-success form-control">Vẽ bảng khác</a>
        <?php
        }
        ?>
    </div>
    <div class="col-md-4">&nbsp;</div>
</div>

</body>
</html>