create sequence if not exists seq_restaurant start with 1 increment 1;

create table if not exists restaurant
(
    restaurant_id   bigint       not null default nextval('seq_restaurant'),
    restaurant_uuid uuid         not null
        constraint dfc_restaurant_uuid    default gen_random_uuid(),
    name            varchar(255) not null,
    address         varchar(255) null,
    record_status   varchar(20)  not null
        constraint dfc_record_status      default 'ACTIVE'
        constraint chc_record_status check (record_status in ('ACTIVE', 'INACTIVE', 'DELETED')),
    inserted_on     timestamp    not null
        constraint dfc_inserted_on        default now(),
    inserted_by     varchar(50)  not null
        constraint dfc_inserted_by        default 'SYSTEM',
    updated_on      timestamp    not null
        constraint dfc_updated_on         default now(),
    updated_by      varchar(50)  not null
        constraint dfc_updated_by         default 'SYSTEM',
    primary key (restaurant_id)
)