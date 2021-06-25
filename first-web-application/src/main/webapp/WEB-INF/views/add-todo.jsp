<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<link rel="stylesheet" href="../../../resources/css/bootstrap.css">
<link rel="stylesheet" href="../../../resources/css/bootstrap-icons.css">
<link rel="stylesheet" href="../../../resources/css/app.css">
	
	<div id="sidebar" class="active">
            <div class="sidebar-wrapper active">
                <div class="sidebar-header">
                    <div class="d-flex justify-content-between">
                        <div class="toggler">
                            <a href="#" class="sidebar-hide d-xl-none d-block"><i class="bi bi-x bi-middle"></i></a>
                        </div>
                    </div>
                </div>
                <div class="sidebar-menu">
                    <ul class="menu">
                        <li class="sidebar-title">Menu</li>

                        <li class="sidebar-item  ">
                            <a href="/logout.do" class='sidebar-link'>
                                <i class="bi bi-grid-fill"></i>
                                <span>Logout</span>
                            </a>
                        </li>

                    </ul>
                </div>
                <button class="sidebar-toggler btn x"><i data-feather="x"></i></button>
            </div>
        </div>
	
	<div id="main">
            <header class="mb-3">
                <a href="#" class="burger-btn d-block d-xl-none">
                    <i class="bi bi-justify fs-3"></i>
                </a>
            </header>

            <div class="page-heading">
                <div class="page-title">
                    <div class="row">
                        <div class="col-12 col-md-6 order-md-1 order-last">
                            <h3>Add something to you buy list!</h3>
                            <p>Anything you would like to add.</p>
                        </div>
                        
                    </div>
                </div>
                <section class="section">
                    <div class="card">
                        <div class="card-header">
                            Your item to be added
                        </div>
                        <div class="card-body">
                            <form method="POST" action="/add-todo.do">
								<fieldset class="form-group">
									<label>Description</label> <input name="todo" type="text"
										class="form-control" /> <BR />
								</fieldset>
								<fieldset class="form-group">
									<label>Category</label> <input name="category" type="text"
										class="form-control" /> <BR />
								</fieldset>
								<input name="add" type="submit" class="btn btn-success" value="Submit" />
							</form>
                        </div>
                    </div>
                </section>
            </div>

            <footer>
                <div class="footer clearfix mb-0 text-muted">
                    <div class="float-start">
                        <p>2021 &copy; Sample web for IBM</p>
                    </div>
                </div>
            </footer>
        </div>
        
        <script src="../../../resources/js/perfect-scrollbar.min.js"></script>
    	<script src="../../../resources/js/bootstrap.bundle.min.js"></script>
    	<script src="../../../resources/js/main.js"></script>