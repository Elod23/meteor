create table orderStatus(StatusCode int primary key identity(1,1),
						StatusDescription nvarchar(2500))
go
create table addresses(AddressID int primary key identity(1,1),
						Street nvarchar(100),
						Number int,
						City nvarchar(100),
						Region nvarchar(100),
						Country nvarchar(100))
go
create table customers(CustomerID INT IDENTITY(1,1) PRIMARY KEY,
						FormaFunctionare nvarchar(3) default 'SRL' not null,
						FirstName nvarchar(100) not null,
						LastName nvarchar(100) not null,
						BirthDate date,
						Email nvarchar(254) not null,
						TelephoneNumber nvarchar(15),
						Password nvarchar(100) not null,
						AddressID int foreign key references Addresses(AddressID))

go
create table suppliers(SupplierID int primary key identity(1,1),
						Name nvarchar(255),
						CUI nvarchar(13) not null,
						SupplierLogoURL nvarchar(2500))
go
create table products(productID int primary key identity(1,1),
						Name nvarchar(255) not null,
						ProductDescription nvarchar(2500),
						MeasurementUnit nvarchar(3),
						SecondaryMU nvarchar(3),
						Price float,
						CantitateStoc float,
						CotaTVA int,
						SuppllierID int foreign key references suppliers(supplierID))
go
create table reviews(ReviewID int primary key identity(1,1),
							Rating int not null,
							Text nvarchar(2500),
							ReviewerID int foreign key references customers(customerID),
							ProductID int foreign key references products(productID))
go
create table shoppingcartstatus(shoppingcartstatusID int primary key identity(1,1),
								shoppingcartstatusDescription nvarchar(2500))
go
create table shoppingcarts(shoppingcartID int primary key identity(1,1),
							CustomerID int foreign key references customers(CustomerID),
							CartLastAdded datetime,
							CartStatusCode int foreign key references shoppingcartstatus(shoppingcartstatusID))
go

create table cartProducts(cartID int foreign key references shoppingcarts(shoppingcartID),
							productID int foreign key references products(productID),
							quantity int)
go

create table categories(CategoryID int primary key identity(1,1),
						Name nvarchar(500) not null)
go
create table productHasCategory(CategoryID int foreign key references categories(CategoryID),
								ProductID int foreign key references products(ProductID))
go 


create table orders(OrderID int primary key identity(1,1),
					CustomerID int foreign key references customers(CustomerID),
					BillingName nvarchar(500),
					DeliveryName nvarchar(500),
					Email nvarchar(255),
					PurchaseDate datetime,
					OrderStatusCode int foreign key references orderStatus(StatusCode),
					BillingAddressID int foreign key references addresses(AddressID),
					DeliveryAddressID nvarchar(500))
go
create table orderedProducts(OrderedProductID int primary key identity(1,1),
								ProductID int foreign key references products(ProductID),
								Name nvarchar(255) not null,
								orderedProductDescription nvarchar(2500),
								Price float,
								TVA int,
								Quantity float,
								OrderID int foreign key references orders(OrderID))