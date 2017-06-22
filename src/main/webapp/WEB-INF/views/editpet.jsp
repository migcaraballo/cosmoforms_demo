<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Pets Demo</title>

        <!--<link href="../css/bootstrap.min.css" rel="stylesheet">-->
        <link href="/cosmoformsdemo/css/united-bootstrap.min.css" rel="stylesheet">

        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>
        <div class="container">
            <h2>Edit Pet</h2>

            <div class="row">
                <div class="col-xs-12">
                    <form id="cosmo-form"></form>
                </div>
            </div>
        </div>
    </body>

    <script src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous"></script>
    <script src="/cosmoformsdemo/js/bootstrap.min.js"></script>

    <script src="/cosmoformsdemo/js/jsonpath-0.8.0.js"></script>
    <script src="/cosmoformsdemo/js/cosmoforms-1.0.0-beta.min.js"></script>

    <script>
        var dataUrl = "/cosmoformsdemo/pet-res/get/${pid}";
        var submitUrl = "/cosmoformsdemo/pet-res/updatepet";

        function successAction(responseObject){
            location.href = "/cosmoformsdemo/pets";
        }

        function cancelAction(){
            location.href = "/cosmoformsdemo/pets";
        }

        cosmoForm({
            "target_form_id" : "cosmo-form",
            "data_url" : dataUrl,
            "override_schema_url" : "/cosmoformsdemo/schemas/test_override_schema.json",
            "submit_url" : submitUrl,
            "success_action": successAction,
            "cancel_action": cancelAction
        });
    </script>
</html>