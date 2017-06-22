<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Pets Demo</title>

        <link href="/cosmoforms_demo/css/bootstrap.min.css" rel="stylesheet">

        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>
        <div class="container">
            <h2>Add Pet</h2>

            <div class="row">
                <div class="col-xs-12">
                    <form id="cosmo-form"></form>
                </div>
            </div>
        </div>
    </body>

    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="/cosmoforms_demo/js/bootstrap.min.js"></script>

    <script src="/cosmoforms_demo/js/jsonpath-0.8.0.js"></script>
    <script src="/cosmoforms_demo/js/cosmoforms-1.0.0-beta.min.js"></script>

    <script>

        var dataUrl = "/cosmoforms_demo/pet-res/emptypet";
        var submitUrl = "/cosmoforms_demo/pet-res/createpet";

        function successAction(responseObject){
            location.href = "/cosmoforms_demo/pets";
        }

        function cancelAction(){
            location.href = "/cosmoforms_demo/pets";
        }

        cosmoForm({
            "target_form_id" : "cosmo-form",
            "data_url" : dataUrl,
            "override_schema_url" : "/cosmoforms_demo/schemas/test_override_schema.json",
            "submit_url" : submitUrl,
            "success_action": successAction,
            "cancel_action": cancelAction
        });
    </script>
</html>